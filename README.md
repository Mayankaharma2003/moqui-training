# RESTful API Documentation

## Overview
This document outlines the RESTful APIs developed for managing Party, Product, and Order data. Each API is designed to perform CRUD (Create, Retrieve, Update, Delete) operations along with specific additional functionalities where applicable.

## Task 1: RESTful APIs for Party Data
### 1. Create a Party
**Endpoint:** `POST /parties`

**Description:** Creates a new party.

**Request Example:**
```json
{
  "partyId": "2",
  "partyType": "Customer",
  "firstName": "Jane",
  "lastName": "Smith"
}
```

**Response Example:**
```json
{
    "partyId": "2"
}
```

### 2. Retrieve Party Details
**Endpoint:** `GET /parties/{party_id}`

**Description:** Retrieves details of a specific party by ID.

**Response Example:**
```json
"partyList": [
        {
            "partyId": "1",
            "partyType": "Customer",
            "firstName": "John",
            "lastName": "Doe"
        }
    ]
```

### 3. Update a Party
**Endpoint:** `PUT /parties/{party_id}`

**Description:** Updates information for an existing party.

**Request Example:**
```json
{
  "partyId": "2",
  "partyType": "Customer",
  "firstName": "Jane",
  "lastName": "Smithaaaa"
}
```

**Response Example:**
```json
{
    "partyId": "2"
}
```

### 4. Delete a Party
**Endpoint:** `DELETE /parties/{party_id}`

**Description:** Deletes a specific party by ID.

**Response Example:**
```json
{
    "partyId": "1"
}
```
## Screenshots
![PartyCreate](https://github.com/user-attachments/assets/c24c780a-b6f7-4531-8d6c-8b2ff440fc49)
![PartyUpdate](https://github.com/user-attachments/assets/3c4c2148-e88a-4bfb-b280-c7890f195a8c)
![PartyFind](https://github.com/user-attachments/assets/0324d08a-aa8e-4af7-9450-b18b6875dcb1)
![PartyDelete](https://github.com/user-attachments/assets/e1688a31-60e6-4b0c-a02e-1a7635909a98)

## Manage Contact Mechanisms for a Party
#### a. Add Contact Mechanism
**Endpoint:** `POST /parties/{party_id}/contacts`

**Request Example:**
```json
{
  "contactMechId": "2",
  "partyId": "2",
  "streetAddress": "350 Fifth Avenue",
  "city": "New York",
  "state": "NY",
  "postalCode": "10118"
}

```

**Response Example:**
```json
{
    "contactMechId": "2"
}
```





#### b. Retrieve Contact Mechanisms
**Endpoint:** `GET /parties/{party_id}/contacts`

**Response Example:**
```json
{
    "contactList": [
        {
            "contactMechId": "2",
            "partyId": "2",
            "streetAddress": "350 Fifth Avenue",
            "city": "New York",
            "state": "NY",
            "postalCode": "10118"
        }
    ]
}
```

#### c. Update Contact Mechanism
**Endpoint:** `PUT /parties/{party_id}/contacts/{contact_mech_id}`

**Request Example:**
```json
{
  "contactMechId": "2",
  "partyId": "2",
  "streetAddress": "350 Fifth Avenue",
  "city": "New York",
  "state": "NY",
  "postalCode": "10119"
}
```

**Response Example:**
```json
{
    "contactMechId": "2"
}
```

#### d. Delete Contact Mechanism
**Endpoint:** `DELETE /parties/{party_id}/contacts/{contact_mech_id}`

**Response Example:**
```json
{
    "partyId": "1"
}
```
## Screenshots
![ContactCreate2](https://github.com/user-attachments/assets/645ebb90-cb69-409b-970a-94c630f731d1)
![ContactCreate](https://github.com/user-attachments/assets/1f720aba-9205-4f6d-9743-5c70542b7ca0)
![ContactUpdate](https://github.com/user-attachments/assets/fde7a766-e7f1-408d-a741-5d22dc7da82f)
![ContactFind](https://github.com/user-attachments/assets/76651469-a32d-448a-86c9-e628d080417e)
![ContactDelete](https://github.com/user-attachments/assets/88875288-8a57-4fd0-80b8-6fca9ac44a55)


## Task 2: RESTful APIs for Product Data
### 1. Create a Product
**Endpoint:** `POST /products`

**Request Example:**
```json
{
  "productId": "4",
  "productName": "Sneakers",
  "color": "Black",
  "size": "9"
}
```

**Response Example:**
```json
{
    "productId": "4"
}
```

### 2. Retrieve Product Details
**Endpoint:** `GET /products/{product_id}`

**Response Example:**
```json
{
    "productList": [
        {
            "productId": "1",
            "productName": "T-Shirt",
            "color": "Red",
            "size": "M"
        }
    ]
}
```

### 3. Update a Product
**Endpoint:** `PUT /products/{product_id}`

**Request Example:**
```json
{
  "productId": "1",
  "productName": "T-Shirt",
  "color": "Red",
  "size": "M"
}
```

**Response Example:**
```json
{
    "productId": "1"
}
```

### 4. Delete a Product
**Endpoint:** `DELETE /products/{product_id}`

**Response Example:**
```json
{
    "productId": "1"
}
```
## Screenshots
![ProductUpdate](https://github.com/user-attachments/assets/a4b7da0f-b18a-4a19-b305-f928e5478c93)
![ProductFind](https://github.com/user-attachments/assets/ea1d2c63-4862-4242-a2e9-83d8542528d2)
![ProductDelete](https://github.com/user-attachments/assets/cf6219ea-b373-4f48-b5cd-2ff3f52ff3eb)
![ProductCreate](https://github.com/user-attachments/assets/a10e24d6-2cd6-4b2d-98e2-63d151f9f08e)


## Task 3: RESTful APIs for Order Data
### 1. Create an Order
**Endpoint:** `POST /orders`

**Request Example:**
```json
{
  "orderId": "1",
  "orderDate": "2025-01-10",
  "partyId": "1",
  "shippingContactMechId": "1",
  "billingContactMechId": "2"
}
```

**Response Example:**
```json
{
    "orderId": "1"
}
```



### 2. Retrieve Order Details
**Endpoint:** `GET /orders/{order_id}`

**Response Example:**
```json
{
    "orderHeaderList": [
        {
            "orderId": "1",
            "orderDate": 1736496000000,
            "partyId": "1",
            "shippingContactMechId": "2",
            "billingContactMechId": "1"
        }
    ]
}
```


### 3. Update an Order
**Endpoint:** `PUT /orders/{order_id}`

**Request Example:**
```json
{
  "orderId": "1",
  "orderDate": "2025-01-10",
  "partyId": "1",
  "shippingContactMechId": "2",
  "billingContactMechId": "1"
}
```

**Response Example:**
```json
{
    "orderId": "1"
}
```




### 4. Delete an Order
**Endpoint:** `DELETE /orders/{order_id}`

**Response Example:**
```json
{
    "orderId": "1"
}
```
## Screenshots
![OrderUpdate](https://github.com/user-attachments/assets/61e0ba40-34fd-45ba-9134-caf1d2b17597)
![OrderPost](https://github.com/user-attachments/assets/7b76ad9a-5496-4742-b3e9-58014afb9b65)
![OrderFind](https://github.com/user-attachments/assets/78d8a3f7-30ab-47fa-99eb-bd40e24a4ac7)
![OrderDelete](https://github.com/user-attachments/assets/770d819f-3d0e-41ec-a000-ec0c691e8c5c)


## Add an Order Item
**Endpoint:** `POST /orders/{order_id}/items`

**Request Example:**
```json
{
  "orderItemSeqId": "1",
  "orderId": "1",
  "productId": "2",
  "quantity": "5",
  "status": "Approved"
}
```

**Response Example:**
```json
{
    "orderItemSeqId": "1"
}
```
## Screenshots
![OrderItemCreate](https://github.com/user-attachments/assets/7916e59a-8529-44dc-9d3c-f1854a8b4d27)

## Screenshot of Swgger
![OrderApiSwager](https://github.com/user-attachments/assets/e9cbaa41-9dcd-4214-9e69-45212a659fd8)
![ProductApiSwagger](https://github.com/user-attachments/assets/122bd60c-9c02-4b20-9d43-dbc655baceae)
![PartyApiSwager](https://github.com/user-attachments/assets/0e914f80-7df1-4b75-865d-1bd306c0c3d0)

## Screenshot of Database Schema
![sql2](https://github.com/user-attachments/assets/6c574ca0-cba9-4a33-9c42-7344fb99a989)
![sql1](https://github.com/user-attachments/assets/ed9918a6-f730-4f64-ac47-19c4a487452d)





This document is a comprehensive guide to the RESTful APIs developed for Party, Product, and Order data management, ensuring a robust system for CRUD operations and additional functionalities.

