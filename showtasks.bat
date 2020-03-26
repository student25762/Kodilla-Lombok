call runcrud.bat
if "%ERRORLEVEL%" == "0" goto openbrowser
echo.
echo runcrud has errors - breaking work
goto fail

:openbrowser
start http://localhost:8080/crud/v1/task/getTasks
goto end

:fail
echo There are errors in your script or application

:end
echo Application is starting