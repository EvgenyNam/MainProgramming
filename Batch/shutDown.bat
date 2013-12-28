@ECHO OFF
color 0E
TITLE testBatch executable

:startScreen
cls
echo Welcome to ShutDown, %USERNAME%
echo Please select from an option below
echo ----------------------------------------------------------
echo 1. Shut down within specified number of minutes
echo 2. Close all running applications and log off
echo 3. Shut down now
echo 4. Restart now
echo 5. Log off now
echo 6. Hibernate now

set /p choice="Enter choice: "
if %choice%==1 goto shutdownComputerInMinutes
if %choice%==2 goto closeRunningApplications
if %choice%==3 goto shutdownNow
if %choice%==4 goto fourthCheck
goto startScreen

:shutdownComputerInMinutes
cls
set /p minutes = "Enter minutes until shutdown: "
set /p seconds = minutes*60
shutdown.exe -s -f -t %seconds%
echo shutdown started at %time%
goto cancel

:closeRunningApplications
cls
shutdown.exe -f
goto end

:shutdownNow
cls
shutdown.exe -s -f
goto end

:restartNow
cls
shutdown.exe -r -f
goto end

:logoffNow
cls
shutdown.exe -l -f
goto end

:hibernateNow
cls
shutdown.exe -h -f
goto end

:end
echo -------------------
echo Would you like to perform another operation? (y/n)
set /p choice="Enter choice: "

if "%choice%"=="y" goto startScreen

PAUSE