(defproject reagent-leaflet "0.1.0-SNAPSHOT"
  :description "Reagent LeafletJS component"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]
                 [figwheel "0.1.5-SNAPSHOT"]
                 [reagent "0.4.3"]]
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-figwheel "0.1.5-SNAPSHOT"]]

  :cljsbuild {:builds [{:id "example"
                        :source-paths ["src"];; "example"]
                        :compiler {:optimizations :none
                                   :source-map true
                                   :preamble ["reagent/react.js"]
                                   :output-to "resources/public/js/compiled/example.js"
                                   :output-dir "resources/public/js/compiled/out"}}
                       ;; FIXME: add production build
                       ]}


  )


