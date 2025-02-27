-- 코드를 입력하세요
SELECT a.NAME, a.DATETIME
    FROM animal_ins AS a
    LEFT JOIN animal_outs AS b ON a.animal_id = b.animal_id
    WHERE b.animal_id IS NULL
    ORDER BY 2
    LIMIT 3;