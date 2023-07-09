<center>
<h1> 🏚️Ecommerce API Project</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center><br>
This project is a Ecommerce API built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The All ...ModelClass  is defined inside the model packages which has the following attributes:
   
   inside User Model:-<br>
   
   Id:integer<br>
    name:string<br>
    email:string<br>
   password:string<br>
   phoneNumber:string <br>
  
   
   
  Product Model:- <br>
   
  id:integer <br>
  name:string<br>
  price:integer<br>
  description:string<br>
  category:string<br>
  brand:string<br>
  
 Address Model:- <br>
   
 id:integer <br>   
 name:string<br>
 landmark:string<br>
 phoneNumber:string<br>
 zipcode:string<br>
 state:string<br>

   
 Order Model:- <br>
   
  id:integer
  userID:integer (foreign key mapping)<br>
  productID:integer(foreign key mapping)<br>
  addressID:integer(foreign key mapping)<br>
  productQuantity:integer<br>

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> addOrder </b>

* PostMapping: /order 

This endpoint makes a call to method in OrderService class which is connected to database. In database we add a new Order given through API.


* GetMapping: 

This endpoint returns data of specific User based on id through API.


* PutMapping: 

This endpoint makes a call to method in ProductService class which is connected to database. In database we update Product.


* DeleteMapping: 

This endpoint makes a call to method in ProductService class which is connected to database. In database we delete Product through API.


---
<b> addAddress </b>

* PostMapping: 

This endpoint makes a call to method in ProductService class which is connected to database. In database we add a new Product given through API.




---

## CrudRepository extends by IOrderRepository and IProductRepository interface.


We have used CrudRepository as a database to implement CRUD Operations.

---

## 📝Project Summary

I have created Ecommerce API project.  In this project I have used @OneToOne maping and the user can add the Order.  Can delete product, update product.  can find product. etc...

