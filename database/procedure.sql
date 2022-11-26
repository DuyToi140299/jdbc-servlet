CREATE PROCEDURE spNhanvien
@nhanvien_name VARCHAR(50) OUT

AS
BEGIN
DECLARE @nhanvien_id INT;
SET @nhanvien_id = 8;
IF @nhanvien_id < 10
SET @nhanvien_name = 'Smith';
ELSE
SET @nhanvien_name = 'Lawrence';

END;
