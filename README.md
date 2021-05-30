# microservices-axon

Command Handler - Post Requests

POST: http://localhost:9090/products-service/products
BODY - APPLICATION/JSON
{
    "title":"tesla-rati",
    "price":900,
    "quantity":1
}

QueryHandler - GET Requests
http://localhost:9090/products-service/products
Output:
[
    {
        "productId": "98496bbb-64ec-4f5c-a1b5-f86499be5160",
        "title": "janga2",
        "quantity": 4,
        "price": 900.00
    },
    {
        "productId": "eefc7653-5606-453a-89f7-c10df0151e92",
        "title": "janga1",
        "quantity": 4,
        "price": 900.00
    }
]
