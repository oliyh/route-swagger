(defproject frankiesardo/pedestal-swagger "0.3.1-SNAPSHOT"
  :description "Swagger documentation for Pedestal routes"
  :url "http://github.com/frankiesardo/pedestal-swagger"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[codox "0.8.10"]]
  :codox {:src-dir-uri "http://github.com/frankiesardo/pedestal-swagger/blob/master/"
          :src-linenum-anchor-prefix "L"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.3.0"]
                 [metosin/ring-swagger "0.18.0"]
                 [metosin/ring-swagger-ui "2.1.1-M1"]]
  :release-tasks [["vcs" "assert-committed"]
                  ["change" "version" "leiningen.release/bump-version" "release"]
                  ["doc"]
                  ["vcs" "commit"]
                  ["vcs" "tag" "v"]
                  ["change" "version" "leiningen.release/bump-version"]
                  ["vcs" "commit"]
                  ["vcs" "push" "--quiet"]]
  :deploy-repositories {"clojars" {:url "https://clojars.org/repo"
                                   :username [:gpg :env/clojars_username]
                                   :password [:gpg :env/clojars_password]}}
  :profiles {:dev {:dependencies [[io.pedestal/pedestal.jetty "0.3.0"]]}})
