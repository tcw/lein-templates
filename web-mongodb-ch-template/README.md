# web-mongodb-ch-template

A Leiningen newnew template for a Leiningen web project with mongoDB 

##Contains

* model	    : mongoDB
* routing   : Compojure
* rendering : Hiccup

##Setup

This template requires Leiningen 2.0+

Create a new template with (pulled from clojars automatically)

    $ lein new web-mongodb-ch-template <new project name>
   			
## Usage

    NB! mongoDB must be running on localhost and default port. 
        Uses 'mongo-test-db' as default,
        removes documents at 'document' and populates it with test data 
        (so don't have any important data at mongo-test-db.document !!)

    $ cd <new project name>
    $ lein deps
    $ lein ring server


## License

Distributed under the Eclipse Public License, the same as Clojure.
