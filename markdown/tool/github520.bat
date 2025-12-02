@echo off
chcp 65001 > nul
cd /d "%~dp0"
timeout /t 30
python hosts.py
pause