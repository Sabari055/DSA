--Write an SQL query to find customers who have placed more than 2 orders.

select customer_id from orders
group by customer_id
having count(order_id) > 2;
