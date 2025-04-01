-- 코드를 작성해주세요
SELECT
    DISTINCT id,
    email,
    first_name,
    last_name
FROM
    developers AS d
    INNER JOIN skillcodes AS s
    ON s.name IN ('C#', 'Python')
    AND d.skill_code & s.code = s.code
ORDER BY 1;