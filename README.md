# Software Architecture

This project combines a wide range of software engineering concepts to create an efficient and maintainable solution:

- Sorting and Searching Algorithms such as Bubble Sort, Selection Sort, Linear Search, and Binary Search, optimize data management and retrieval.
- DTO (Data Transfer Object) ensures clean separation of data across layers, improving scalability.
- Domain-Driven Design (DDD) focuses on aligning the software model with business requirements, enhancing collaboration and clarity.
- Clean Architecture promotes modularity, separation of concerns, and long-term maintainability.
- Integration with PostgreSQL ensures reliable, scalable data storage, while REST APIs provide a seamless interface for communication.
- Following SOLID principles helps in creating flexible and extensible systems, making the codebase easy to maintain and extend over time.
- Builder Design Pattern simplifies the creation of complex objects.
- Strategy Design Pattern flexibility to update, reusability across contexts, and scalability for complex cases with new strategies.

These technologies work together to build a robust and scalable application, following industry best practices for software development.

# Technical Instructions

## Request to create Department (PostgreSql)
```bash
curl -X POST 'http://localhost:9090/departments' \
--header 'Content-Type: application/json' \
--data '{
    "code": "FIN_01",
    "name": "Financial"
}'
```
## Response:
```json
{
    "code": "FIN_01"
}
```
## Request to create Employee (PostgreSql)
```bash
curl -X POST 'http://localhost:9090/employees?storage=POSTGRES' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Rafael de Azevedo",
    "role": "TEAM_LEADER",
    "salary": 20000.00,
    "departmentCode": "FIN_01"
}'
```

## Response:
```json
{
    "name": "Rafael de Azevedo",
    "role": "TEAM_LEADER",
    "departmentCode": "FIN_01"
}
```

## Request to create Employee (File)
```bash
curl -X POST 'http://localhost:9090/employees?storage=FILE' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Rafael de Azevedo",
    "role": "TEAM_LEADER",
    "salary": 20000.00,
    "departmentCode": "FIN_01"
}'
```

## Response:
```json
{
    "name": "Rafael de Azevedo",
    "role": "TEAM_LEADER",
    "departmentCode": "FIN_01"
}
```

## Request to create Employee Bulk (PostgreSql)
```bash
curl -X POST 'http://localhost:9090/employees/bulk?storage=POSTGRES''
```

## Response:
```json
[
    {
        "name": "Máire Ní Bhraonáin",
        "role": "MAIN_MANAGER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Seamus O'Rourke",
        "role": "TEAM_LEADER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Máire Ní Bhraonáin",
        "role": "MAIN_MANAGER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Fionn McCarthy",
        "role": "TEAM_LEADER",
        "departmentCode": "MKT_01"
    },
    {
        "name": "Bernadette McBride",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    }
]
```
## Request to create Employee Bulk (File)
```bash
curl -X POST 'http://localhost:9090/employees/bulk?storage=FILE''
```

## Response:
```json
[
    {
        "name": "Máire Ní Bhraonáin",
        "role": "MAIN_MANAGER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Seamus O'Rourke",
        "role": "TEAM_LEADER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Máire Ní Bhraonáin",
        "role": "MAIN_MANAGER",
        "departmentCode": "FIN_01"
    },
    {
        "name": "Fionn McCarthy",
        "role": "TEAM_LEADER",
        "departmentCode": "MKT_01"
    },
    {
        "name": "Bernadette McBride",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    }
]

```
## Request to find sorted Employee list (PostgreSql)
```bash
curl -X GET 'http://localhost:9090/employees?storage=POSTGRES''
```

## Response:
```json
[
    {
        "name": "Aoife Dunne",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    },
    {
        "name": "Bernadette McBride",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "SAL_01"
    },
    {
        "name": "Brian O'Mahony",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "SAL_01"
    },
    {
        "name": "Brian O'Mahony",
        "role": "TEAM_LEADER",
        "departmentCode": "MKT_01"
    },
    {
        "name": "Ciara Fitzpatrick",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    }
]
```
## Request to find sorted Employee list (File)
```bash
curl -X GET 'http://localhost:9090/employees?storage=FILE''
```

## Response:
```json
[
    {
        "name": "Aoife Dunne",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    },
    {
        "name": "Bernadette McBride",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "SAL_01"
    },
    {
        "name": "Brian O'Mahony",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "SAL_01"
    },
    {
        "name": "Brian O'Mahony",
        "role": "TEAM_LEADER",
        "departmentCode": "MKT_01"
    },
    {
        "name": "Ciara Fitzpatrick",
        "role": "ASSISTANT_MANAGER",
        "departmentCode": "HR_01"
    }
]
```

## Data Saved in File
![image](https://github.com/user-attachments/assets/86549c58-e7c2-4bd1-aa0c-0f56177fdd9d)

## Data Saved in PostgreSql
### Department Table
![image](https://github.com/user-attachments/assets/139407b6-2d02-4758-a1f0-b99d27c7d6f6)
### Employee Table
![image](https://github.com/user-attachments/assets/3eb27784-f906-4bda-9cf4-1a45f0d5d9f5)

## Custom Constraints

![image](https://github.com/user-attachments/assets/d596e4c9-0596-4958-9239-6f7c05cd34a1)

