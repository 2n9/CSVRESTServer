# csv-RestAPI-server
csvファイルを簡単にRESTAPIに変換してくれるサーバーソフト

### /api/v1/getfiles  
指定したフォルダ（/data/）にあるファイルすべてを取得します。  
|  返り値  |  型  |  説明  |
| ---- | ---- | ---- |
|  fileCount  |  int  | フォルダにあるファイル数 |
|  files  |  (Path[]) File[]  | フォルダにあるファイル一覧 |
|  path   |  String  |  フォルダのパス  |  

![sample](https://github.com/2n9/CSVRESTServer/blob/master/pics/2021-11-27_17h26_35.png?raw=true)

# License   / ライセンス
"csv-RESTAPI-server" is under [MIT license](https://en.wikipedia.org/wiki/MIT_License).