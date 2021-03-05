# Spring data demo

#### this app is a demo for add items to cart (not the best practices just for demonstration purpose to insert items cascading using spring data)

`add items to new cart`

just use curl Request from postman to test the endpoint

`curl --location --request POST 'http://localhost:8080/cart' \
--header 'Content-Type: application/json' \
--data-raw '[
{
"name": "router"
}, {
"name": "mouse"
}, {
"name": "keybord"
}
]'`