## Travel agency
- Technology stack
  - Angular - UI
  - Spring Boot - backend

- Project business features - refinement in progress
  - registration of users/admin etc.
    -two roles: users and administrator
    - normal user
        -sign up
    - admin
      - defined in application - starting approach
  - provide all available trips
      - travel datetime
      - destination - start and end
        - country
        - city
      - cost (per person)
      - transport type
        - bus, train, plane, ferry
      - security rules
        - travel restrictions
        - insurance
      - payment type
      - meal types
        - breakfast
        - lunch
        - dinners
        - snacks
        - drinks
        - HB
        - all inclusive
      - hotel facilities
        - attractions
        - apartment fac.
        
  - searching
    - country selection
    - city
    - number of people
    - dates boundaries (starting/ending/no dates)
    - type of transport
    

  - map of destinations
    - possibility to select from map destin.and later see availability trips there
  
  - booking trips
    - contact to person who is going to pay
      - email, phone
    - data of all passangers
    - name
    - surname 
    - birth
    - nationality
    - passport number
    - gender
    
### TODO

  - last/first minute offers
  - reviews section
  - online chat
  - customer travel history + possibility to add places which you already visited
  - vip/premium  customers


### Additional features

  - type of the trip (business/family)
  - think about more searching options (future)
    - budget
  
  
### Technical stories
- provide all available trips (user)
  - backend
    - create trip entity
      - tripStartDate
      - tripEndDate
      - destination (class)
        - country
        - city
      - price
        - cost (BigDecimal)
        - currency
      - transport type (Enum)
        - bus, train, plane, ferry
      - security rules
        - travel restrictions
        - insurance
      - payment type (Enum)
        - Money, Card, Transfer, Apple Pay, Google Pay, Paypal, installment payment
      - meal type (Enum)
        - breakfast
        - lunch
        - dinners
        - snacks
        - drinks
        - HB
        - all inclusive
      - hotel facilities
          - attractions (list)
          - apartment facilities (list)
      - list of photos urls
    - trip dto
    - create TripController (REST)
      - read all trips - paging by default (defaule size: 10)
      - read one trip - by id
        
    - create TripService
    - create TripRepository
    - handle photos urls (TODO)


  - frontend
    - cards with trips
    - some photos