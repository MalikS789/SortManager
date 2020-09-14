![Sparta](/Assets/Git_Hub/SPARTALOGO.png)
# Service Object Model (SOP)
- Structural pattern that manages different types of API call
- Made up generally of 3 different components:
	1. DTOs (Data Transfer Objects) for each of the different **types** of response
	2. A Connection Manager that handles connection details
	3. An Injector responsible for injecting JSON data into a DTO

- Designed to make it easier to tests APIs with different types of responses 
