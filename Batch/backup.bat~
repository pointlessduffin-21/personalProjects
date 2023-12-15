@ECHO OFF
CLS
REM SET VARIABLES VALUES

SET MySQLDir=C:\xampp\mysql\bin
SET %dbName%=manzaneque_limited
SET BackupFileName=%Database%%DATE:~10,4%%DATE:~4,2%%DATE:~7,2%%TIME:~0,2%%TIME:~3,2%.sql
SET BackupFolderPath=D:/Backups/

IF NOT EXIST %BackupFolderPath% mkdir %BackupFolderPath%

ECHO DB Backup started...
cd %MySQLDir%
mysqldump -u root -p %dbName% > "%BackupFolderPath%%BackupFileName%"
ECHO DB Backup completed... 