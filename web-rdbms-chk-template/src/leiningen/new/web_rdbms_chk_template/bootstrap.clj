(ns {{ns-name}}.bootstrap
  (:require [clojure.java.jdbc :as sql]
            [{{ns-name}}.config :as conf]))

(defn create-table-books []
  (sql/create-table
    :books [:id "int" "AUTO_INCREMENT primary key"]
    [:ranking "varchar(30)"]
    [:year "int"]
    [:title "varchar(255)"]
    [:author "varchar(100)"]))

(defn test-data-books []
  (sql/insert-values
    :books [:ranking :year :title :author ]
    [1 1922 "Ulysses" "James Joyce"]
    [2 1925 "The Great Gatsby" "F. Scott Fitzgerald"]
    [3 1916 "A Portrait of the Artist as a Young Man" "James Joyce"]
    [4 1955 "Lolita" "Vladimir Nabokov"]
    [5 1932 "Brave New World" "Aldous Huxley"]
    [6 1929 "The Sound and the Fury" "William Faulkner"]
    [7 1961 "Catch-22" "Joseph Heller"]
    [8 1940 "Darkness at Noon" "Arthur Koestler"]
    [9 1913 "Sons and Lovers" "D. H. Lawrence"]
    [10 1939 "The Grapes of Wrath" "John Steinbeck"]))

(defn create-test-data []
    (sql/with-connection conf/h2-mem-spec
      (sql/transaction
        (create-table-books)
        (test-data-books)
        )) nil)
