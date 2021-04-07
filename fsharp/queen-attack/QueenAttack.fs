﻿module QueenAttack

let create =
    function
    | (x, _) when x < 0 || x > 7 -> false
    | (_, y) when y < 0 || y > 7 -> false
    | _ -> true

let canAttack (q1x: int, q1y: int) (q2x: int, q2y: int) =
    match () with
    | () when q1x = q2x -> true
    | () when q1y = q2y -> true
    | () when abs (q1x - q2x) = abs (q1y - q2y) -> true
    | _ -> false