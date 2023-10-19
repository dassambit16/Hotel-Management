# Hotel Management

This is a Hotel Management application developed with Java, Maven, and Spring Boot. It provides a system to manage hotel rooms efficiently.

## Dependencies

- Spring Boot Starter Web
- Lombok
- JPA
- H2 Database

## Data Flow

- **Room**
  - roomId
  - roomNo
  - roomType (AC or NON_AC)
  - roomPrice

## Controllers

- **GET /rooms**: Retrieve a list of all rooms.
- **GET /room/{id}**: Retrieve a room by its ID.
- **GET /room/{roomType}**: Retrieve a list of rooms by room type (AC or NON_AC).
- **POST /room**: Add a new room.
- **POST /rooms**: Add multiple rooms.
- **PUT /room/price**: Update room price.
- **DELETE /room/{roomId}**: Delete a room by its ID.

## Project Summary

This application provides a comprehensive system for managing hotel rooms, allowing you to Create, Read, Update, and Delete (CRUD) hotel rooms through different API endpoints.

### Usage

- Use the GET endpoints to retrieve information about hotel rooms.
- Use the POST endpoints to add new rooms or update room prices.
- Use the PUT endpoint to update room prices.
- Use the DELETE endpoint to remove a room by its ID.

