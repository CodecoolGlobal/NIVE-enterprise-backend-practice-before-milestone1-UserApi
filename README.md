# REST API Practice
## Write a 3 layer architecture REST service
for the `User` object, with the following properties:
- `Long id`
- `String name`
- `boolean enabled`
- `List<String> roles`

## Implement the following endpoints

| method | path                    | description                                                                 |
|--------|-------------------------|-----------------------------------------------------------------------------|
| GET    | `/users`                | returns a list of all users                                                 |
| POST   | `/user`                 | saves a new user, returns the generated id, incrementing the last generated |
| GET    | `/user/{id}`            | queries a user by id                                                        |
| PUT    | `/user/{id}`            | updates an existing user                                                    |
| DELETE | `/user/{id}`            | deletes a user by id                                                        |
| GET    | `/users?hasRole=EDITOR` | queries users by role                                                       |
| GET    | `/users/enabled`        | gets a list of all enabled users                                            |


## Validation
In case of invalid User object is sent with POST/PUT request, send **BAD_REQUEST** as response (status code 400).
Validation rules:
- `name` - not blank, min length 8 character, starts with an uppercase character, ends with 4 digits.
- `roles` - list is not null, list has at least size 1
 