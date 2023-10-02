# Getting Started

### Yet to be done

* liquibase scripts for managing DB versioning : ddl, plus data load
* finish service layer DTOs
* finish REST layer DTOs
* finish mappers of DTOs between layers (using Dozer or structmap)
* introduce caching, firstly simply stupid inside spring APP , than backed by the REDIScahce
* caching should be introduced in the service layer
* local env : docker compose  for local testing and debug
* int tests for Persistence layer ( DB Unit) 
* unit tests for service layer with mocks (e.g. mockito)
* int test for REST layer (e.g. rest assured)
* need to test cache evictions
* not sure in get all players endpoint we want to get tha whole list : probably pagination is more preferable
* taking into account the above(the pagination) need to think how will this be compatibale with caching (not the best idea to cache pages).  consider other strategies how to extract chunks of players (e.g. by country, age etc. which will be largely dependent on the business requirements)

why do we need so many DTOs : depends on our needs
in this case we strive for maximum independence between layers, changes in one layer should not affect all the rest.

of course if we understand that DTO is quite stable and will not be changing , we could have employed simply spring-data-rest, which would ease life significantly


but if there is a chance of DB changes , or REST contract changes, introduction of other ways of communication(grpc, messaging, etc) it is risky to go with the approach of single entity for all contracts/layers

```
create table player
(
id            text not null
primary key,
birth_year    integer,
birth_month   integer,
birth_day     integer,
birth_country VARCHAR(256),
birth_state   VARCHAR(256),
birth_city    VARCHAR(256),
death_year    integer,
death_month   integer,
death_day     integer,
death_country VARCHAR(256),
death_state   VARCHAR(256),
death_city    VARCHAR(256),
name_first    VARCHAR(256),
name_last     VARCHAR(256),
name_given    VARCHAR(256),
weight        integer,
height        integer,
bats_hand     VARCHAR(5),
throws_hand   VARCHAR(5),
debut_game    date,
final_game    date,
retro_id      VARCHAR(256),
bb_ref_id     VARCHAR(256)
);
```
