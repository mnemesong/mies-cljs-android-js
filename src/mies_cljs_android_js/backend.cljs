(ns mies-cljs-android-js.backend
    (:require [androidjs :as androidjs]))

(.on androidjs/back
  "hello from front"
  #(try (do
         (.send androidjs/back "hello from back" "Hello from Android JS server!")
         (do 0))
        (catch :default e (js/console.log e))))
