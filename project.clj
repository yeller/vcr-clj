(defproject com.gfredericks/vcr-clj "0.2.1"
  :description "HTTP recording/playback for Clojure"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.codec "0.1.0"]
                 [fs "1.0.0"]
                 [clj-http "0.5.3"]]
  :dev-dependencies [[ring/ring-jetty-adapter "1.1.2"]])