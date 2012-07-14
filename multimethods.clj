


;========================
; Basic Multi-Methods
;========================

; Last argument can be function. Since keys can be used as functions, we can pull
; the paymentmethod from the parameter
(defmulti service-fee :PaymentMethod)


(defmethod service-fee :Paypal [payment]  (* 0.029 (:amount payment)))
(defmethod service-fee :Wepay [payment] (* 0.03 (:amount payment)))


; ~ $.35
(println (service-fee {:PaymentMethod :Paypal :amount 12.0 }))

; $.36
(println (service-fee {:PaymentMethod :Wepay :amount 12.0 }))