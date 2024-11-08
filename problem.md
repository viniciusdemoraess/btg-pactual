# Software Engineer Challenge - BTG Pactual

## Instructions

1. Carefully read this document before starting the activities.
2. You have **1 day** to deliver the work plan (item 1).
3. You have up to **7 calendar days** to complete the requested activities.  
   If you are unable to complete all the tasks, please submit what you have done by the deadline.
4. Create a repository on **GitHub** for your project and keep it **public**.
5. Once you finish the delivery steps, send an email with the subject line **"[BTG CHALLENGE] - YOUR FULL NAME"** to: **[email address]**.
6. Feel free to use any technologies, frameworks, or techniques not mentioned in the activities or replace those you deem necessary. In your report, specify any changes made and the reasons for them.
7. The application must be delivered in a **"runnable"** state, with instructions on how to interact with it.
8. We recommend using **Docker** (http://www.docker.com) to set up the environment (MongoDB, RabbitMQ, Web Application, etc.).  
   If you choose to use Docker, create a **single image** containing all containers and share it in your final report.

## Scope
Process orders and generate a report.

## Activities
1. Create and deliver a **work plan**.
    - Define tasks
    - Estimate hours for each task
2. Develop an application using the technology of your choice (Java, .NET, Node.js).
3. Design and implement a **database** (PostgreSQL, MySQL, MongoDB).
4. Create a **microservice** that consumes data from a **RabbitMQ queue** and stores the data to list the following information:
    - Total value of the order
    - Number of orders per customer
    - List of orders made by each customer

Example of the message to be consumed:

```json
{
    "codigoPedido": 1001,
    "codigoCliente": 1,
    "itens": [
        {
            "produto": "lápis",
            "quantidade": 100,
            "preco": 1.10
        },
        {
            "produto": "caderno",
            "quantidade": 10,
            "preco": 1.00
        }
    ]
}
```

5. Create a **REST API** that allows querying the following information:
    - Total value of the order
    - Number of orders per customer
    - List of orders made by each customer

6. **Technical Report** summarizing the following:
    - **Work Plan** (planned vs. actual execution)
    - If there was any deviation between the original plan and execution, explain what happened.
    - If the work plan was followed without deviation, mention the reasons for this outcome.
    - **Technologies used**
    - Programming languages, versions, IDEs, OSs
    - **Architecture diagram**
    - Database modeling
    - Solution deployment diagram
    - Infrastructure diagram, including cloud resources used (machine, OS, specific products, etc.)
    - **Evidence of functional tests** for the application
    - Publish the generated code on your **GitHub profile** (https://github.com/).
    - In the report, include:
        - Your GitHub profile and the URL(s) of the generated code
        - References used
        - Any other items you consider relevant (testing frameworks or techniques, methodologies, etc.)
        - If Docker was used to set up the environment, publish the final images on your **DockerHub profile** (http://hub.docker.com).
        - In the report, provide:
            - Your DockerHub profile and the URL(s) of the generated images
