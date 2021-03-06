(defproject project-name "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1806"]
                 [compojure "1.1.5"]
                 [jayq "2.4.0"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "0.3.2"]
            [lein-ring "0.8.7"]]
  :source-paths ["src/clj"]
  :cljsbuild {
    :builds {
      :main {
            :source-path "src/cljs"
            :compiler {
                      :output-to "resources/public/js/cljs.js"
                      :optimizations :simple
                      :pretty-print true}}}}
  :main project-name.server
  :ring {:handler project-name.server/app})
