
# Spring Boot REST API

This is the example project that shows you how to build Spring boot REST API that connects to MySQL databse using Spring JdcbTemplate.




## Features

- Create employee
- List all employees
- Fetch single employee by id
- Update employee by id
- Delete employee by id

  
## API Reference

We will create a Employee REST API, following are the rest end points

### Get all employees

```http
  GET /api/v1/employees
```

#### Sample Response

```json
  [
    {
        "id": 1,
        "name": "Bushan",
        "location": "India",
        "department": "IT"
    },
    {
        "id": 2,
        "name": "Bharath",
        "location": "India",
        "department": "Sales"
    },
    {
        "id": 3,
        "name": "Chaitra",
        "location": "India",
        "department": "IT"
    }
]
```

### Get single employee

```http
  GET /api/v1/employees/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of employee to fetch |

#### Sample Response

```json
{
    "id": 2,
    "name": "Bharath",
    "location": "India",
    "department": "Sales"
}
```

### Save employee

```http
  POST /api/v1/employees
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `employee reference`      | `Employee` | **Required**. Request body of employee |

#### Sample Request

```json
{
    "name": "Bharath",
    "location": "India",
    "department": "Sales"
}
```

### Update employee

```http
  PUT /api/v1/employees/${id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of employee to update |
| `employee reference`      | `Employee` | **Required**. Request body of employee |

#### Sample Request

```json
{
    "name": "Bharath",
    "location": "India",
    "department": "Sales"
}
```

### Delete employee

```http
  DELETE /api/v1/employees/${id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of employee to delete |



## Installation

Download the project and import it to any IDE.
Open the class `SpringbootjdbcApplication.java` and run as Java application.
    
## Demo

Insert gif or link to demo

  
## Authors

- [@scbushan05](https://www.github.com/scbushan05)

  
## Related

Here are some related projects

[Awesome README](https://github.com/matiassingers/awesome-readme)

  
