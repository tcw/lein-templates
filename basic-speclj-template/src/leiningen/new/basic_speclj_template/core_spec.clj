(ns {{sanitized}}.core-spec
(:use
  [speclj.core]
  [{{sanitized}}.core]))

(describe "Say Hello"

  (it "says hello"
    (should= "Hello, foo" (foo "foo"))))

(run-specs)