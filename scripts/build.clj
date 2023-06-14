(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'mies-cljs-android-js.frontend
     :output-to "assets/cljs/frontend.js"
     :output-dir "assets/cljs"
     :asset-path "../assets/cljs"
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


