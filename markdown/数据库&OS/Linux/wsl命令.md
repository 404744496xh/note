## 问题
### 1.修改默认的用户
打开 Ubuntu-22.04 WSL 会话。

使用文本编辑器创建或编辑 /etc/wsl.conf 文件。可以使用 nano 或 vim 等编辑器。例如，如果使用 nano，可以输入以下命令：

`sudo nano /etc/wsl.conf`
将以下内容粘贴或输入到 wsl.conf 文件中：
```conf
[boot]
systemd=true

[user]
default=xh

```

确保将 xh 替换为想要设置为默认用户的用户名。

保存文件并退出编辑器。如果使用的是 nano，可以按 Ctrl + X，然后按 Y 确认保存，最后按 Enter 键。

关闭所有打开的 WSL 会话。可以通过在 PowerShell 中运行以下命令来关闭所有 WSL 实例：

`wsl --shutdown`
重新启动 WSL 会话。可以通过在 PowerShell 中运行以下命令来启动的 Ubuntu-22.04：

`wsl -d Ubuntu-22.04`
验证更改是否生效。登录后，应该默认以用户 xh 的身份进入系统。

## 常用命令

| 命令 | 描述 |
| --- | --- |
| `wsl --install` | 安装 Windows Subsystem for Linux。 |
| `wsl --update` | 更新 WSL 到最新版本。 |
| `wsl --list --verbose` | 列出所有已安装的 Linux 发行版及其状态。 |
| `wsl --set-default ` | 设置默认的 Linux 发行版。 |
| `wsl -d ` | 启动特定的 Linux 发行版。 |
| `wsl -e ` | 运行指定的 Linux 命令或脚本。 |
| `wsl --list --running` | 列出当前正在运行的 Linux 发行版。 |
| `wsl --terminate ` | 关闭特定的 Linux 发行版。 |
| `wsl --shutdown` | 关闭所有正在运行的 Linux 发行版。 |
| `wsl --export  ` | 导出 Linux 发行版到指定路径。 |
| `wsl --import   ` | 从指定路径导入 Linux 发行版。 |
| `wsl --unregister ` | 卸载 Linux 发行版。 |
| `wsl --version` | 显示当前安装的 WSL 版本。 |
| `wsl --set-version  ` | 设置特定发行版的 WSL 版本（1 或 2）。 |
| `wsl --set-default-version ` | 设置 WSL 的默认版本。 |

