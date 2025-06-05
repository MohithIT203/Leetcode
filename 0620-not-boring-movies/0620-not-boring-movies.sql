SELECT id, movie, description, rating
FROM Cinema
WHERE id % 2 = 1 and description not like "boring"
ORDER BY rating DESC;
