//
//  SynopticNetworkViewManager.m
//  DoubleConversion
//
//  Created by limeng on 2020/1/9.
//

#import "SynopticNetworkViewManager.h"

@implementation SynopticNetworkViewManager

RCT_EXPORT_MODULE(SynopticNetworkView)

-(UIView *)view{
    SynopticNetworkCustomView *view = [[SynopticNetworkCustomView alloc] initWithFrame:CGRectMake(0, 100, 209, 48) ViewType:SynopticNetworkCustomViewTypeHorizontal UserKey:@"rSv9eAovIJ" Location:@"beijing"];
    
    view.viewPosition = SynopticNetworkCustomViewPositionTopLeft;//悬浮位置
    view.contentViewAlignmen = SynopticNetworkContentViewAlignmentCenter;//内容水平方向显示对齐方式
    view.iconType = SynopticNetworkCustomViewIconTypeDark;//图标样式
    view.padding = UIEdgeInsetsMake(0, 0, 0, 0);//SynopticNetworkCustomView的内边距
    view.backgroundColor = [UIColor redColor];//视图背景颜色
    view.contentViewBackgroundImage = [UIImage imageNamed:@""];//视图背景图片
    view.navigationBarBackgroundColor = [UIColor redColor];//导航条背景颜色
    view.progressColor = [UIColor blueColor];//进度条颜色
    view.textColor = [UIColor greenColor];//文字颜色
    view.dragEnable = YES;//是不是能拖曳
    view.freeRect = CGRectMake(0, 0, 0, 0);//拖拽范围
    view.dragDirection = SynopticNetworkCustomViewDragDirectionAny;//拖拽的方向
    view.isKeepBounds = YES;//黏贴边界效果
    //2.4 将插件视图添加到需要显示的视图上
    [self.view addSubview:view];
    return view;
}

@end
