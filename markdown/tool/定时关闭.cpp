#include <iostream>  
#include <windows.h>  
#include <conio.h> // 注意：这不是标准C++，但在某些Windows环境中可用  
  
using namespace std;  
  
int main() {  
    const int totalSeconds = 30; // 总等待时间（秒）  
    const int checkInterval = 1; // 检查间隔（秒）  
  
    cout << "将在30分钟后关闭StarRail.exe，按任意键提前关闭或按Esc取消：" << endl;  
  
    for (int seconds = 0; seconds < totalSeconds; ++seconds) {  
        if (_kbhit()) { // 检查是否有按键被按下（注意：_kbhit 是特定于Windows的）  
            char c = _getch(); // 读取按键（不回显）  
            if (c == 27) { // Esc键的ASCII码是27  
                cout << "已取消关闭。" << endl;  
                return 0;  
            } else {  
                cout << "即将关闭StarRail.exe..." << endl;  
                system("taskkill /im StarRail.exe /F");  
                return 0;  
            }  
        }  
        Sleep(checkInterval * 1000); // 等待检查间隔的时间（毫秒）  
    }  
  
    // 如果30分钟过去了还没有按键，则执行关闭操作  
    cout << "时间到，正在关闭StarRail.exe..." << endl;  
    system("taskkill /im StarRail.exe /F");  
  
    return 0;  
}