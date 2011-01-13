(ns maru.test.common.utility.core
  (:use [maru.common.utility.core] :reload)
  (:use [clojure.test]))

(deftest test-even-terms
  (is (= (list 2 4) (even-terms (list 1 2 3 4 5)))))

(deftest test-split-string-at-position-one
  (is (= (list "ab" "c") (split-string-at "abc" 1))))

(deftest test-insert-element-at-position-last
  (is (= (list "a" "b" "c") (insert-last (list "a" "b") "c"))))

(deftest test-remove-string-upto-index
  (is (= "bc" (remove-string-upto "abc" 1))))

(deftest convert-letter-to-digit
  (is (= 7 (letter-to-digit (first "H12")))))

(deftest convert-digit-to-letter
  (is (= "H" (digit-to-letter 7))))

(deftest convert-string-to-integer
  (is (= 12 (string-to-digit "12"))))

(deftest convert-digit-to-letter
  (is (= 12 (string-to-digit "12"))))

(deftest ls-not-contains-element
  (is (= true (!contains (list 1 2 3) 0))))

(deftest ls-contains-element
  (is (= false (!contains (list 1 2 3) 1))))

(deftest set-not-contains-element
  (is (= true (!contains (set [1 2 3]) 0))))

(deftest set-not-contains-element
  (is (= false (!contains (set [1 2 3]) 1))))
