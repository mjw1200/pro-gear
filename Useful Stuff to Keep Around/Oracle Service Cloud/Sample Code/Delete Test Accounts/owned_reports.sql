SELECT a.owner_acct_id, b.login, b.first_name, b.last_name, b.email_address, COUNT(*) AS 'OWNED REPORTS'
FROM analytics_core a
	JOIN accounts b ON a.owner_acct_id = b.acct_id
WHERE a.ac_public = 0
GROUP BY a.owner_acct_id
ORDER BY a.owner_acct_id