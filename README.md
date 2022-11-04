# Java_Spring_Practice
This repo is used to store codes of spring. 


# Bean
- Can be defined with tags in the xml config file or use the annotation @Component("bean-name")
- The default values of variables of a class can be set using <value> tag or @Value annotation
- Objects within a class can be set by <ref bean=bean-name/> tag or @Autowired
- @Scope("prototype") or @Scope("singleton") tells spring container if multiple object can be initialized .

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
