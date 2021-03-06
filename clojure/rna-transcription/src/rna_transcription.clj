(ns rna-transcription)

(def dna-to-rna {\C \G
                 \G \C
                 \A \U
                 \T \A})

(defn to-rna [dna]
  (->> (map #(or (dna-to-rna %) 
                 (throw (AssertionError.))) dna)
       (apply str)))