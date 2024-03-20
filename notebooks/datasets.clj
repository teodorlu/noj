;; # Datasets

(ns datasets
  (:require [tablecloth.api :as tc]
            [scicloj.kindly.v4.kind :as kind]))

;; For our tutorials here,
;; let us fetch some datasets from [Rdatasets](https://vincentarelbundock.github.io/Rdatasets/)

(def iris
  (-> "https://vincentarelbundock.github.io/Rdatasets/csv/datasets/iris.csv"
      (tc/dataset {:key-fn keyword})
      (tc/rename-columns {:Sepal.Length :sepal-length
                          :Sepal.Width :sepal-width
                          :Petal.Length :petal-length
                          :Petal.Width :petal-width
                          :Species :species})))

iris

(def mtcars
  (-> "https://vincentarelbundock.github.io/Rdatasets/csv/datasets/mtcars.csv"
      (tc/dataset {:key-fn keyword})))

mtcars