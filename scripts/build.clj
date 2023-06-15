(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:main 'mies-cljs-android-js.frontend
     :output-to "assets/cljs-frontend/frontend.js"
     :output-dir "assets/cljs-frontend"
     :asset-path "../assets/cljs-frontend"
     :verbose true})
  (b/build "src"
    {:main 'mies-cljs-android-js.backend
     :output-to "assets/cljs-backend/backend.js"
     :output-dir "assets/cljs-backend"
     :asset-path "./assets/cljs-backend"
     :target :nodejs
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


