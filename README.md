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

Problem Remaining:
PaymentRequest construction becomes difficult to maintain
as the number of fields increases, especially optional fields.
