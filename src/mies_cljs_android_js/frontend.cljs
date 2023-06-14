(ns mies-cljs-android-js.frontend)

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

;;(enable-console-print!)

;; (println "Hello world!")

(js/front.send "hello from front")

(js/front.on
  "hello from back"
  (fn [msg] (.log js/console msg) 
            (set! (. (js/document.getElementById "msg") -innerHTML) msg)))
