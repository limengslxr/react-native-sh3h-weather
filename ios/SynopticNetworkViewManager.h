//
//  SynopticNetworkViewManager.h
//  DoubleConversion
//
//  Created by limeng on 2020/1/9.
//

#import <React/RCTViewManager.h>
#import <React/RCTBridgeModule.h>

#import <Plugin_SDK_iOS/Plugin_SDK_iOS.h>

@interface SynopticNetworkViewManager : RCTViewManager

@property(nonatomic, weak)SynopticNetworkCustomView *customView;

@end

