int main()
{
    int len_s,ans;
    scanf("%d", &len_s); fgetc(stdin);
    char s[257];
    scanf("%[^\n]", s);
    for(int i=0;s[i]!='\0';i++){
     ans = s[i]+ans;
   
    }

    int res = floor(ans/len_s);
    char a = res;
   printf("%c",a);
    return 0;
}
