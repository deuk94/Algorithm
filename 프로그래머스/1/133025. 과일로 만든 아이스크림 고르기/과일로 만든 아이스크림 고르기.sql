-- 코드를 입력하세요
SELECT h.flavor
    FROM first_half AS h
    INNER JOIN icecream_info AS i ON h.flavor = i.flavor
    WHERE h.total_order > 3000 AND i.ingredient_type = 'fruit_based'
    ORDER BY total_order DESC;