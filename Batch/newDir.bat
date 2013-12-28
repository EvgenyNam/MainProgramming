@ECHO OFF
color 1C
title Organize Desktop

echo Welcome to organize desktop

echo %USERNAME%
echo %USERPROFILE%
echo -----

dir>tmpFile
set /p directory = <tmpFile
del tmpFile
echo %directory%

if exist "%USERPROFILE%\Desktop\Hello" goto exit
if not exist "%USERPROFILE%\Desktop\Hello" goto createNewDir

:createNewDir
md "%USERPROFILE%\Desktop\Hello"

:exit
pause