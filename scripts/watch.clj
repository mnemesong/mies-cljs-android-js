(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'mies-cljs-android-js.core
   :output-to "out/mies_cljs_android_js.js"
   :output-dir "out"})
