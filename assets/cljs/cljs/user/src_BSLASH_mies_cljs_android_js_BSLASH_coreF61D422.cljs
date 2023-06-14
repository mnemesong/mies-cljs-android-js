(ns mies-cljs-android-js.core)

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

;;(enable-console-print!)

;; (println "Hello world!")

(require 'goog.object)

(js/front.send "hello from front")

(js/front.on
  "hello from back"
  (fn [msg] (.log js/console msg) (goog.object/set (js/document.getElementById "msg") html msg)))
