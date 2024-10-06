---

## <font style="color:rgb(79, 79, 79);">一、vi和vim介绍</font>
1. **<font style="color:rgba(0, 0, 0, 0.85);">vi</font>**<font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">是一个基本的文本编辑器，功能较少，启动速度快。</font>
2. **<font style="color:rgba(0, 0, 0, 0.85);">vim</font>**<font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">是</font><font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">vi</font><font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">的增强版，提供了更多高级功能，如语法高亮、插件支持、更丰富的用户界面等。</font>
3. **<font style="color:rgba(0, 0, 0, 0.85);">vim</font>**<font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">支持插件，可以通过安装插件来扩展其功能，而</font><font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">vi</font><font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">不支持。</font>
4. **<font style="color:rgba(0, 0, 0, 0.85);">vim</font>**<font style="color:rgba(0, 0, 0, 0.85);"> </font><font style="color:rgba(0, 0, 0, 0.85);">提供了更好的用户界面和更多的配置选项。</font>
5. **<font style="color:rgba(0, 0, 0, 0.85);">vim</font>**<font style="color:rgba(0, 0, 0, 0.85);"> 与 vi 兼容，但 vim 的某些高级功能在 vi 中不可用。</font>

## <font style="color:rgb(79, 79, 79);">二、vim的三种模式(重点)</font>
#### <font style="color:rgb(79, 79, 79);">1.三种模式</font>
<font style="color:rgb(254, 44, 36);background-color:rgb(238, 240, 244);">命令模式</font><font style="color:rgb(79, 79, 79);background-color:rgb(238, 240, 244);">：不能对文件直接编辑，只能通过快捷键进行一些操作(如移动光标、复制、粘贴等)，打开vim后默认进入命令模式；</font>

<font style="color:rgb(254, 44, 36);background-color:rgb(238, 240, 244);">末行模式</font><font style="color:rgb(79, 79, 79);background-color:rgb(238, 240, 244);">：可在末行输入一些命令对文件进行操作(如搜索、替换、保存、退出、高亮等)；</font>

<font style="color:rgb(254, 44, 36);background-color:rgb(238, 240, 244);">编辑模式</font><font style="color:rgb(79, 79, 79);background-color:rgb(238, 240, 244);">：可对文件内容进行编辑；</font>

#### <font style="color:rgb(79, 79, 79);">2.vim的进入和退出</font>
<font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">进入</font><font style="color:rgb(77, 77, 77);">：</font>

<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">vim 文件路径       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">直接打开指定文件(光标位于首行或上次关闭文件时光标的所在行)</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">vim +数字 文件路径     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">打开指定文件并将光标移动到指定行(数字对应的行数)</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">vim +/关键词 文件路径   </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">打开指定文件并高亮显示关键词</font>

<font style="color:rgb(254, 44, 36);">语法4：</font><font style="color:rgb(77, 77, 77);">vim 文件路径1 文件路径2 文件路径3    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">可同时打开多个文件，文件之间可切换操作</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180554790-c2ad7934-5d30-42bf-8f23-e384d66fd081.png)

<font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">退出</font><font style="color:rgb(77, 77, 77);">：</font>

<font style="color:rgb(254, 44, 36);">语法：</font><font style="color:rgb(77, 77, 77);">:q           //键盘输入英文:号进入末行模式，输入字母q再回车</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180554778-4959d458-fa92-401e-ba6e-9233de5b1069.png)

## <font style="color:rgb(79, 79, 79);">三、vim模式切换(重点)</font>
#### <font style="color:rgb(79, 79, 79);">1.切换到命令模式</font>
<font style="color:rgb(77, 77, 77);">用vim指令打开文件时默认为命令模式；</font>

<font style="color:rgb(77, 77, 77);">按一下键盘ESC键可从编辑模式切换到命令模式；</font>

<font style="color:rgb(77, 77, 77);">按一下或连按两下ESC键或用键盘删除末行模式下的英文符号:可从末行模式切换到命令模式</font>

#### <font style="color:rgb(79, 79, 79);">2.切换到末行模式</font>
<font style="color:rgb(77, 77, 77);">命令模式下键盘输入英文符号:可切换到末行模式；</font>

#### <font style="color:rgb(79, 79, 79);">3.切换到编辑模式</font>
<font style="color:rgb(77, 77, 77);">命令模式下键盘输入字母i或a(还有其他字母也可以这两个比较常用)可切换到编辑模式以编辑</font>

<font style="color:rgb(254, 44, 36);">注意</font><font style="color:rgb(77, 77, 77);">：vim刚打开文件时默认为命令模式，命令模式可切换到末行模式或编辑模式，但</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">末行模式与编辑模式之间不能直接相互切换</font><font style="color:rgb(77, 77, 77);">；</font>

## <font style="color:rgb(79, 79, 79);">四、命令模式</font>
#### <font style="color:rgb(79, 79, 79);">1.光标移动</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">^        </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入符号^，光标移动到光标所在行的行首</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">$       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入符号$，光标移动到光标所在行的行尾</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">gg     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母gg，光标移动到文件的首行</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180554887-2a2970ab-956c-4297-9868-8060a0c77da1.png)

<font style="color:rgb(77, 77, 77);"></font><font style="color:rgb(254, 44, 36);">上图中</font><font style="color:rgb(77, 77, 77);">，当输入一个g时不是正确语法在右下角可以看到输入的内容g，当输入两个g时立刻会执行命令，这里不便演示，只需按语法输入命令即可执行</font>

<font style="color:rgb(254, 44, 36);">语法4：</font><font style="color:rgb(77, 77, 77);">G       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母G，光标移动到文件的尾行</font>

<font style="color:rgb(254, 44, 36);">语法5：</font><font style="color:rgb(77, 77, 77);">ctrl+b      </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘ctrl+b，向上翻屏(</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">前提</font><font style="color:rgb(77, 77, 77);">是文件内容足够翻屏)</font>

<font style="color:rgb(254, 44, 36);">语法6：</font><font style="color:rgb(77, 77, 77);">ctrl+f       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘ctrl+f，向下翻屏</font>

<font style="color:rgb(254, 44, 36);">语法7：</font><font style="color:rgb(77, 77, 77);">数字G   </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入数字+字母G，光标移动到指定行(数字对应的行数)</font>

<font style="color:rgb(254, 44, 36);">语法8：</font><font style="color:rgb(77, 77, 77);">数字+键盘方向键上</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">下   </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入数字+键盘方向键上</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">下，光标以光标所在行为准向上</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">下移动指定行(对应的数字)</font>

<font style="color:rgb(254, 44, 36);">语法9：</font><font style="color:rgb(77, 77, 77);">数字+键盘方向键左</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">右   </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入数字+键盘方向键左</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">右，光标以光标所在位置为准向左</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">右移动指定个字符(对应的数字)</font>

<font style="color:rgb(254, 44, 36);">语法10：</font><font style="color:rgb(77, 77, 77);">:数字     </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+数字再回车，光标移动到指定行(属于末行模式)</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180554998-1626f28b-bad9-4540-9b28-566f16f6f6e8.png)

#### <font style="color:rgb(79, 79, 79);">2.复制与粘贴</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">yy        </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母yy，复制光标所在行</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">数字yy      </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入数字+字母yy，从光标所在行开始向下复制指定行(数字对应的行数，</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">包括了光标所在行</font><font style="color:rgb(77, 77, 77);">)</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">ctrl+v     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘ctrl+v进入</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">可视化复制</font><font style="color:rgb(77, 77, 77);">，用键盘的方向键控制复制区域，然后键盘输入字母yy即可完成复制</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555099-874485fa-a583-4bcf-8fd5-46fb874f5024.png)

<font style="color:rgb(254, 44, 36);">上图中</font><font style="color:rgb(77, 77, 77);">，进入可视化复制后可用键盘方向键控制复制区域，选中区域后输入yy即可完成复制，右下角的3*6表示当前复制区域的大小，17,4表示光标的当前位置是第17行第4个字符</font>

<font style="color:rgb(254, 44, 36);">粘贴语法：</font><font style="color:rgb(77, 77, 77);">p      </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母p即可在</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">光标处</font><font style="color:rgb(77, 77, 77);">粘贴复制的内容</font>

#### <font style="color:rgb(79, 79, 79);">3.剪切</font>**<font style="color:rgb(79, 79, 79);">/</font>**<font style="color:rgb(79, 79, 79);">删除</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">dd     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母dd，剪切光标所在行，光标所在行的下面行会上移填补剪切行</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">数字dd    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入数字+字母dd，从光标所在行起向下剪切指定行(数字对应的行数，包括了光标所在行)，后面行会上移填补剪切部分</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">D         </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母D，剪切光标所在行但后面行不会上移填补剪切行，剪切行变空</font>

<font style="color:rgb(254, 44, 36);">删除语法：</font><font style="color:rgb(77, 77, 77);">删除即剪切后不复制，删除操作使用剪切语法</font>

#### <font style="color:rgb(79, 79, 79);">4.撤销与恢复</font>
<font style="color:rgb(254, 44, 36);">撤销语法：</font><font style="color:rgb(77, 77, 77);">:u      </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入符号:和字母u再回车(属于末行模式)，撤销上一步操作</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555252-affc8208-5635-401d-bec9-f49194b60bc5.png)

<font style="color:rgb(254, 44, 36);">恢复语法：</font><font style="color:rgb(77, 77, 77);">ctrl+r   </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘ctrl+r，恢复撤销操作(即取消之前的撤销操作)</font>

## <font style="color:rgb(79, 79, 79);">五、末行模式</font>
#### <font style="color:rgb(79, 79, 79);">1.保存</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:w       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母w再回车，保存当前文件</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:w 文件路径    </font>**<font style="color:rgb(77, 77, 77);">  //</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母w+空格+文件路径再回车，</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">另存</font><font style="color:rgb(77, 77, 77);">为指定文件</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555339-175e294f-4b3f-42c5-926f-40342d4f4371.png)

#### <font style="color:rgb(79, 79, 79);">2.退出</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:q     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母q再回车，退出当前文件</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:wq     </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母wq再回车，保存当前文件并退出</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555433-49f702e6-4f6a-42a2-b0a7-0e346a29c059.png)

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">:q!   </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母q+英文符号!再回车，</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">不保存</font><font style="color:rgb(77, 77, 77);">对文件的修改并退出</font>

#### <font style="color:rgb(79, 79, 79);">3.调用外部命令</font>
<font style="color:rgb(254, 44, 36);">语法：</font><font style="color:rgb(77, 77, 77);">:q外部命令  </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母q+外部命令再回车，外部命令如 ls 命令等，不退出文件的同时执行外部命令，执行后按任意键可以切换回文件</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555543-3c9eb73a-6869-4fd0-b85c-055e6c8b50a0.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555767-0a7f3df8-a65a-401f-9eb0-7863fc5be4e5.png)

#### <font style="color:rgb(79, 79, 79);">4.搜索</font>**<font style="color:rgb(79, 79, 79);">/</font>**<font style="color:rgb(79, 79, 79);">查找</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:/关键词     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+/+关键词再回车，按关键词查找，查找到的内容会被高亮显示</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555852-c7809f20-9cb6-483e-b5d5-56c6073a7764.png)

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">N</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">n    </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入字母N</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">n，光标移动到上</font>**<font style="color:rgb(77, 77, 77);">/</font>**<font style="color:rgb(77, 77, 77);">下一个查找到的内容(属于命令模式)</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">:nohl    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母nohl再回车，取消查找到的内容的高亮显示，若不取消内容会一直高亮显示</font>

#### <font style="color:rgb(79, 79, 79);">5.替换</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:s/搜索的内容/新内容       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">用新内容替换光标所在行</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">第一处</font><font style="color:rgb(77, 77, 77);">被搜索到的内容</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:s/搜索的内容/新内容/g      </font>**<font style="color:rgb(77, 77, 77);">  //</font>**<font style="color:rgb(77, 77, 77);">用新内容替换</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">光标所在行</font><font style="color:rgb(77, 77, 77);">全部被搜索到的内容</font>

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">:%s/搜索的内容/新内容      </font>**<font style="color:rgb(77, 77, 77);">  //</font>**<font style="color:rgb(77, 77, 77);">用新内容替换</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">整个文件</font><font style="color:rgb(77, 77, 77);">每一行第一处被搜索到的内容</font>

<font style="color:rgb(254, 44, 36);">语法4：</font><font style="color:rgb(77, 77, 77);">:%s/搜索的内容/新内容/g      </font>**<font style="color:rgb(77, 77, 77);">  //</font>**<font style="color:rgb(77, 77, 77);">用新内容替换整个文件</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">全部</font><font style="color:rgb(77, 77, 77);">被搜索到的内容</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180555855-93359e71-92cd-43c7-b6df-43ed8616e366.png)

#### <font style="color:rgb(79, 79, 79);">6.显示行号</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:set nu    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母set+空格+字母nu再回车，显示文件每行的行号，显示行号是</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">暂时的</font><font style="color:rgb(77, 77, 77);">下次打开该文件不会再显示</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556150-b8865ff6-7149-4f78-adba-c3a83ecd59a2.png)

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:set nonu   </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母set+空格+字母nonu再回车，取消行号显示</font>

#### <font style="color:rgb(79, 79, 79);">7.切换文件</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:files    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母files再回车，查看同时打开的所有文件的名称</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556225-73d0af10-3e15-4a4a-8f1b-2f0da11a91aa.png)

<font style="color:rgb(254, 44, 36);">上图中</font><font style="color:rgb(77, 77, 77);">，%a表示它对应的文件是当前操作的文件，#表示它对应的文件是上一个操作的文件，行数处显示第0行表示从未切换到它对应的文件进行操作</font>

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:open 文件名      </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母open+空格+文件名再回车，切换到其他打开的文件进行操作</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556348-c66b0324-97f1-4dff-97ba-bbb5d455c18b.png)

<font style="color:rgb(254, 44, 36);">语法3：</font><font style="color:rgb(77, 77, 77);">:bn     </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母bn再回车，切换到下一个打开的文件</font>

<font style="color:rgb(254, 44, 36);">语法4：</font><font style="color:rgb(77, 77, 77);">:</font>[<font style="color:rgb(77, 77, 77);">bp</font>](https://so.csdn.net/so/search?q=bp&spm=1001.2101.3001.7020)<font style="color:rgb(77, 77, 77);"> </font><font style="color:rgb(77, 77, 77);">    </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母bn再回车，切换到上一个操作的文件</font>

<font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">注意：每执行完一次末行模式下的命令之后，都会自动退回到命令模式，因此每次执行末行模式下的命令都需要先键盘输入英文符号:后再输入命令</font>

## <font style="color:rgb(79, 79, 79);">六、编辑模式</font>
<font style="color:rgb(77, 77, 77);">命令模式下键盘输入以下字母可进入编辑模式进行对应的操作：</font>

| <font style="color:rgb(79, 79, 79);background-color:rgb(255, 217, 0);">i</font> | <font style="color:rgb(79, 79, 79);background-color:rgb(255, 217, 0);">在光标所在字符前开始插入</font> |
| :--- | :--- |
| <font style="color:rgb(79, 79, 79);background-color:rgb(255, 217, 0);">a</font> | <font style="color:rgb(79, 79, 79);background-color:rgb(255, 217, 0);">在光标所在字符前开始插入</font> |
| <font style="color:rgb(79, 79, 79);">o</font> | <font style="color:rgb(79, 79, 79);">在光标所在行的下面另起一行开始插入</font> |
| <font style="color:rgb(79, 79, 79);">I</font> | <font style="color:rgb(79, 79, 79);">在光标所在行的行首开始插入，若行首有空格则在空格后插入</font> |
| <font style="color:rgb(79, 79, 79);">A</font> | <font style="color:rgb(79, 79, 79);">在光标所在行的行尾开始插入</font> |
| <font style="color:rgb(79, 79, 79);">O</font> | <font style="color:rgb(79, 79, 79);">在光标所在行的上面另起一行开始插入</font> |
| <font style="color:rgb(79, 79, 79);">S</font> | <font style="color:rgb(79, 79, 79);">删除光标所在行并开始插入</font> |


<font style="color:rgb(77, 77, 77);">按照以上不同的方式进入编辑模式后，正常使用键盘进行增删改即可，</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">重点掌握前两种方式</font><font style="color:rgb(77, 77, 77);">，退出编辑模式键盘按ESC键；</font>

## <font style="color:rgb(79, 79, 79);">七、vim功能模块</font>
#### <font style="color:rgb(79, 79, 79);">1.代码着色</font>
<font style="color:rgb(254, 44, 36);">语法1：</font><font style="color:rgb(77, 77, 77);">:syntax on     </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母syntax+空格+on，开启代码着色，</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">默认是开启</font><font style="color:rgb(77, 77, 77);">的</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556402-cb294c1d-eea8-4326-a479-cf27ea198146.png)

<font style="color:rgb(254, 44, 36);">语法2：</font><font style="color:rgb(77, 77, 77);">:syntax off     </font>**<font style="color:rgb(77, 77, 77);"> </font>****<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">键盘输入英文符号:+字母syntax+空格+off，关闭代码着色(该操作是</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">暂时的</font><font style="color:rgb(77, 77, 77);">)</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556402-1e10d564-3553-47b3-9714-66ab48f14a16.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556674-28ef2d17-f7e6-49fb-b1b2-7819496711c7.png)

#### <font style="color:rgb(79, 79, 79);">2.</font>[<font style="color:rgb(79, 79, 79);">简易计算器</font>](https://so.csdn.net/so/search?q=%E7%AE%80%E6%98%93%E8%AE%A1%E7%AE%97%E5%99%A8&spm=1001.2101.3001.7020)
<font style="color:rgb(77, 77, 77);">当编辑文件中需要用计算器计算时，不需要退出文件，可以使用vim的简易计算器完成计算；</font>

<font style="color:rgb(254, 44, 36);">使用方法：</font>

<font style="color:rgb(77, 77, 77);">在</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">编辑模式下</font><font style="color:rgb(77, 77, 77);">键盘ctrl+r，然后键盘输入符号=，光标就会移动到末行，键盘输入计算格式后回车，计算结果就会出现在原光标位置处；</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556808-fd98ca0b-c74f-4ab5-8632-2c3283e8a01a.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180557011-d22fe9ab-6ea5-44a7-86bc-0dc6851f1ed9.png)

## <font style="color:rgb(79, 79, 79);">八、补充内容</font>
#### <font style="color:rgb(79, 79, 79);">1.vim的配置(重点)</font>
<font style="color:rgb(254, 44, 36);">常用配置：</font>

<font style="color:rgb(77, 77, 77);">syntax on/off       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">开启/关闭代码着色</font>

<font style="color:rgb(77, 77, 77);">set nu/nonu        </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">显示/不显示行号</font>

<font style="color:rgb(254, 44, 36);">配置分类：</font>

<font style="color:rgb(77, 77, 77);"></font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">临时配置</font><font style="color:rgb(77, 77, 77);">：在末行模式下输入配置，此配置是暂时的，下次打开文件时不会生效；</font>

<font style="color:rgb(77, 77, 77);"></font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);"> 个人配置</font><font style="color:rgb(77, 77, 77);">：个人配置文件路径是~/.vimrc，即当前用户家目录下的隐藏文件.vimrc，此配置只对当前用户永久生效，若不存在.vimrc文件可自行创建编辑加入vim配置；</font>

<font style="color:rgb(77, 77, 77);"></font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">全局配置</font><font style="color:rgb(77, 77, 77);">：全局配置文件路径是/etc/vim/vimrc，不同版本目录路径可能有点差异，此配置对所有用户永久生效，可编辑全局配置文件加入vim配置；</font>

<font style="color:rgb(254, 44, 36);">注意：</font><font style="color:rgb(77, 77, 77);">对于同一配置项，当个人配置存在此配置项时遵循个人配置，否则遵循全局配置；</font>

#### <font style="color:rgb(79, 79, 79);">2.异常退出</font>
<font style="color:rgb(77, 77, 77);">编辑中的文件未保存直接退出(按终端右上角的叉或断电等)，这就是</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">异常退出</font><font style="color:rgb(77, 77, 77);">；异常退出会产生一个隐藏的</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">交换文件</font><font style="color:rgb(77, 77, 77);">(</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">.文件名.swp</font><font style="color:rgb(77, 77, 77);">，编辑中产生的临时文件，可以指令ls -a查看)，并且在下一次打开该异常退出的文件时</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">会报错</font><font style="color:rgb(77, 77, 77);">，将交换文件删除即可正常打开；</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180556925-5cac0065-2136-491d-b645-13fa0f844d8a.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180557085-374330f5-6715-4b42-aedd-d8e6c6f85b40.png)

#### <font style="color:rgb(79, 79, 79);">3.别名机制(非常有趣)</font>
<font style="color:rgb(77, 77, 77);">依靠一个</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">别名映射文件</font><font style="color:rgb(77, 77, 77);">(路径时~/.bashrc)来执行自己</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">创建的指令</font><font style="color:rgb(77, 77, 77);">，这就是</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">别名机制</font><font style="color:rgb(77, 77, 77);">；在映射文件中按特定格式加入自己的指令即可执行自己创建的指令；</font>

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180557235-3350e8f8-ccf0-49f0-bc56-d583e2fdc690.png)

![](https://cdn.nlark.com/yuque/0/2024/png/46412986/1728180557346-423a2057-d13a-4017-92fa-27f90ff15b1d.png)

<font style="color:rgb(254, 44, 36);">上图中</font><font style="color:rgb(77, 77, 77);">， vim打开.baserc文件，找到上图内容处可按格式加入自己创建的指令，如最后一行是我加的，即haha指令将等效于clear指令(笑两下就可以清屏了，不过我的</font><font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">失败</font><font style="color:rgb(77, 77, 77);">了，好像是添加的位置不对)；</font>

<font style="color:rgb(254, 44, 36);">注意：</font><font style="color:rgb(77, 77, 77);">加入自己的指令后需要重启才能生效；</font>

#### <font style="color:rgb(79, 79, 79);">4.退出方式</font>
<font style="color:rgb(254, 44, 36);">语法：</font><font style="color:rgb(77, 77, 77);">:x       </font><font style="color:rgb(77, 77, 77);"> </font>**<font style="color:rgb(77, 77, 77);">//</font>**<font style="color:rgb(77, 77, 77);">文件未被修改直接退出，文件被修改过保存并退出</font>

<font style="color:rgb(254, 44, 36);">:x和:wq的区别：</font>

<font style="color:rgb(77, 77, 77);">使用:wq，文件的修改时间一定会改变；</font>

<font style="color:rgb(77, 77, 77);">而使用:x，在文件未被修改的情况下，并不会改变文件的修改时间；</font>

<font style="color:rgb(77, 77, 77);background-color:rgb(255, 217, 0);">建议：</font><font style="color:rgb(77, 77, 77);">使用:x代替:q和:wq，更加简便的同时不会在未修改文件的情况下改变文件的修改时间</font>

