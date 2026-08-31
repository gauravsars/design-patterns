# design-patterns
designing a payment app

Version 1 — Basic Payment Processing
Client
  ↓
PaymentService
  ↓
if Stripe
if Razorpay
if PayPal

Problem:

PaymentService contains provider-specific payment logic.

Adding a new payment provider requires modifying PaymentService.

Responsibility of identifying the processor to process the request and then processing the request using that processor lies with 
PaymentService.

************************************************************************************************************
************************************************************************************************************

Version 2 — Strategy Pattern
Client
  ↓
PaymentService
  ↓
PaymentProcessor
  ↓
StripeProcessor / RazorpayProcessor / PaypalProcessor

Problem Solved: Payment behavior is separated into independent strategies.

Problem Remaining:

Client still needs to create/select the correct processor using the requestType in the paymentRequest Object.
****************************************************************************************************************
****************************************************************************************************************


V3 — Factory + Strategy

PaymentService
      ↓
PaymentProcessorFactory
      ↓
"STRIPE"
      ↓
StripeProcessor

Problem Solved:
Processor creation/selection is centralized in the Factory.
Now Client does not need to create/select the correct processor using the requestType in the paymentRequest Object.
It is now delegated to Factory class , Factory class will identify the processor based on the requestType.

Problem Remaining:
PaymentRequest construction becomes difficult to maintain
as the number of fields increases, especially optional fields.


****************************************************************************************************************
****************************************************************************************************************

Version 4 — Builder Pattern

PaymentRequest.builder()
        ↓
customerId(...)
paymentType(...)
amount(...)
currency(...)
        ↓
build()
        ↓
PaymentRequest

Problem Solved:
Complex PaymentRequest objects can be created in a
readable and maintainable way, especially with optional fields.

Problem Remaining:
Payment validation logic can become more complex when multiple independent validations need to run before payment processing.

Suppose before processing payment we need to validate on the below checks:

Fraud Check
Limit Check
Currency Check
Customer Status Check
Blacklist Check

one solution is to write it into validation class and call from PaymentService

if (fraud...) ...
if (limit...) ...
if (currency...) ...
if (customer...) ...
if (blacklist...) ...

 V5 will address this only

How to address Multiple sequential validations cleanly.
****************************************************************************************************************
****************************************************************************************************************
