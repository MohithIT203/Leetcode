select v.customer_id,COUNT(v.customer_id) as count_no_trans
from Visits v
left join Transactions t on
v.visit_id=t.visit_id WHERE t.visit_id IS NULL
group by(v.customer_id);
