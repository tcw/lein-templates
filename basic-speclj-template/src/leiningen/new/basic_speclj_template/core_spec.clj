(ns {{ns-name}}.core-spec
(:use
  [speclj.core]
  [{{ns-name}}.core]))

(describe "Say Hello"

  (it "says hello"
    (should= "Hello, foo" (foo "foo"))))

(run-specs)
