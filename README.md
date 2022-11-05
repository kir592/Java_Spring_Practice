# Java_Spring_Practice
This repo is used to store practice code of spring. 


# Bean
- Can be defined with tags in the xml config file or use the annotation @Component("bean-name")

## Example via XML
https://github.com/kir592/Java_Spring_Practice/blob/cb38fb72cff3a73602de314d5c68a576234b2304/Core/src/main/java/com/spring/springcore/reftypes/studentconfig.xml#L11


## Example via annotation
https://github.com/kir592/Java_Spring_Practice/blob/5bd578425e4276f817c44b84e27bddad44e1476b/Core%20Advanced/src/main/java/com/spring/springcoreadvanced/objviaannotation/Instructor.java#L5-L6

https://github.com/kir592/Java_Spring_Practice/blob/5bd578425e4276f817c44b84e27bddad44e1476b/Core%20Advanced/src/main/java/com/spring/springcoreadvanced/objviaannotation/config.xml#L12

## ...
- The default values of variables of a class can be set using <value> tag or @Value annotation
- Objects within a class can be set by <ref bean=bean-name/> tag or @Autowired
- @Scope("prototype") or @Scope("singleton") tells spring container if multiple object can be initialized .
- Properties can be accessed through a property list
https://github.com/kir592/Java_Spring_Practice/blob/5bd578425e4276f817c44b84e27bddad44e1476b/Core%20Advanced/src/main/java/com/spring/springcore/propertyfiletest/config.xml#L12-L24
  
  

# Bean Life Cycle Methods
- Within bean add the following: init-method="init" and destroy-method="destroy" will call respective methods
- Destroy method is not invoked by default (has to be set)
- Usable with annotation @PostConstruct and @PreDestroy

# ORM
- Object relational mapping
- Mapping of DB and Java Objects
- JPA is the standard
- implementable using Hibernate, TopLink or JDO


## Hibernate Template
Example:
- ProductDao (interface) depends on HibernateTemplate
- ProductDaoImpl implements ProductDao
- HibernateTemplate uses SessionFactory Bean
  
### Annotation
- @Entity and @Id mandatory, whereby @Id is the primary key
- @Table(name="tablename") if the class has a different name than the table
- @Column(name="attributename") if the variable have different names than the columns in the table
https://github.com/kir592/Java_Spring_Practice/blob/174915d3cff5bd1bb74c5cd3f42b05e8263a2bc5/ORM_via_Hibernate/src/main/java/com/spring/springorm/product/entity/Product.java#L8-L19
  
# Spring MVC
- JSP uses <% ... %> inside the view
- A class is defined as a controller by @Controller
- A JSP page is assigned to each controller via @RequestMapping("/mypage")
  
## Sending data from Controller to UI
- Inside the controller, you can add primitive data or objects to the modelview object
https://github.com/kir592/Java_Spring_Practice/blob/174915d3cff5bd1bb74c5cd3f42b05e8263a2bc5/MVC/src/main/java/com/bharath/spring/springmvc/controller/HelloController.java#L10-L18
- the data or objects can be accessed by request.getAttribte("key")
https://github.com/kir592/Java_Spring_Practice/blob/174915d3cff5bd1bb74c5cd3f42b05e8263a2bc5/MVC/src/main/webapp/WEB-INF/views/hello.jsp#L11-L18
  
## Sending data from UI to Controller
### Via HTML Form
- A Controller returns a form, which user will fill out
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/webapp/WEB-INF/views/userReg.jsp#L10-L18
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/java/com/bharath/spring/springmvc/controller/UserController.java#L11-L24
  
  
- A Class has to be created that matches the form
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/java/com/bharath/spring/springmvc/dto/User.java#L3-L12
  
  
#### Request Parameter
- You can have parameters in the URI with  @RequestParam("key") int id
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/java/com/bharath/spring/springmvc/controller/RequestParamsController.java#L11-L20
  
  
## ModelMap and String View
- The "ModelAndView Object" connects the Model and View in a single object, in cases where we don't need the data (the model), we still have to create the ModelAndView object
- Hence, instead of creating a "ModelAndView Object" you can use "ModelMap and String View" instead
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/java/com/bharath/spring/springmvc/controller/UserController.java#L14-L17
https://github.com/kir592/Java_Spring_Practice/blob/7ea8a8cf25995ce479dd9a4716ff48ac9d7b801a/MVC/src/main/java/com/bharath/spring/springmvc/controller/UserController.java#L19-L24
  
